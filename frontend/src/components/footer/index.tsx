const Footer = () => {
  return (
    <footer className="footer mt-auto py-3 bg-dark">
      <div className="container">
        <p className="text-light">
          App developed by{" "}
          <a
            href="https://github.com/developer-rrm14"
            target="_blank"
            rel="noreferrer"
          >
            Roberto Rebouças
          </a>
        </p>
        <p className="text-light">
          <small>
            <strong>Sales Dashboard Example</strong>
            <br />
            Contact Us:{" "}
            <a
              href="https://www.linkedin.com/in/roberto-rebou%C3%A7as-de-melo-678b3695/"
              target="_blank"
              rel="noreferrer"
            >
              www.linkedin.com/in/roberto-rebouças-de-melo
            </a>
          </small>
        </p>
      </div>
    </footer>
  );
};

export default Footer;
