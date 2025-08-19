import { Link } from "react-router-dom";

export default function Footer() {
    return(
        <footer className="border-top mt-5 footer-styles">
        <div className="container py-4 d-flex flex-column flex-md-row align-items-center justify-content-between">
          <div>
            <div className="fw-bold">Dev Daily</div>
            <small className="text-muted">© {new Date().getFullYear()} • All rights reserved</small>
          </div>
          <ul className="nav">
            <li className="nav-item"><Link className="nav-link px-2" to="/news">Tech News</Link></li>
            <li className="nav-item"><Link className="nav-link px-2" to="/prep">Interview Prep</Link></li>
            <li className="nav-item"><Link className="nav-link px-2" to="/trending">Trending Topics</Link></li>
            <li className="nav-item"><Link className="nav-link px-2" to="/search">Search</Link></li>
          </ul>
        </div>
      </footer>
    );
}