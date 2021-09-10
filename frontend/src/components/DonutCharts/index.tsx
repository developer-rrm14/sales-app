import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";
import Chart from "react-apexcharts";
import { SaleSum } from "types/sale";
import { AMOUNT_BY_SELLER, BASE_URL } from "utils/requests";

//const mockData = {
//  series: [477138, 499928, 444867, 220426, 473088],
//  labels: ["Anakin", "Barry Allen", "Kal-El", "Logan", "Padmé"],
//};

type ChartData = {
  labels: string[];
  series: number[];
};

const options = {
  legend: {
    show: true,
  },
};

const DonutChart = () => {
  const [chartData, setChartData] = useState<ChartData>({
    labels: [],
    series: [],
  });

  useEffect(() => {
    axios.get(BASE_URL + AMOUNT_BY_SELLER).then((response) => {
      const data = response.data as SaleSum[];
      const myLabels = data.map((x) => x.sellerName);
      const mySeries = data.map((x) => x.sum);

      setChartData({ labels: myLabels, series: mySeries });
    });
  }, []);

  return (
    <Chart
      options={{ ...options, labels: chartData.labels }}
      series={chartData.series}
      type="donut"
      height="240"
    />
  );
};

export default DonutChart;
