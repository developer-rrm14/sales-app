import BarChart from "components/BarCharts";
import DataTable from "components/Datatable";
import DonutChart from "components/DonutCharts";
import Footer from "components/Footer";
import NavBar from "components/Navbar";

const DashBoard = () => {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Sales Dashboard</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Success Rate (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">All Sales</h5>
            <DonutChart />
          </div>
        </div>
        <div className="py-3">
          <h2 className="text-primary">All Sales</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
};

export default DashBoard;
