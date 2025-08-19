import { Link, NavLink, useNavigate } from "react-router-dom";
import logo from '../../assets/AppLogo.png';

export default function Navbar() {
    const navigate = useNavigate();
    const onSearch = (e) => {
        e.preventDefault();
        const searching = e.currentTarget.elements.searching.value.trim();
        if(searching) navigate(`/search?q=${encodeURIComponent(searching)}`);
    };
    return(
        <>
            <header className="sticky-top shadow-sm">
                <nav className="navbar navbar-expand-lg navbar-gradient">
                    <div className="container fluid">
                        <Link className="navbar-brand" to="/">
                            <img src={logo} alt="Dev-Daily logo" className="brand-logo"></img>
                        </Link>
                        <button className="navbar-toggler" type="button" 
                        data-bs-toggle="collapse" data-bs-target="#mainNavbar" aria-controls="mainNavbar" 
                        aria-expanded="false" aria-label="Toggle Navigation">
                            <span className="navbar-toggle-icon"></span>
                        </button>

                        {/*items of Navbar*/}
                        <div className="collapse navbar-collapse" id="mainNavbar">
                            <ul className="navbar-nav me-auto">
                                <li className="nav-item">
                                    <NavLink to="/" end className={({isActive}) => "nav-link" + (isActive ? " active" : "")}>Home</NavLink></li>
                                <li className="nav-item">
                                    <NavLink to="/news" className={({isActive}) => "nav-link" + (isActive ? " active" : "")}>Tech News</NavLink></li>
                                <li className="nav-item">
                                    <NavLink to="/prep" className={({isActive}) => "nav-link" + (isActive ? " active" : "")}>Interview Prep</NavLink></li>
                                <li className="nav-item">
                                    <NavLink to="/trend" className={({isActive}) => "nav-link" + (isActive ? " active" : "")}>Trending Topics</NavLink></li>
                            </ul>
                            <form className="d-flex me-2" role="search" onSubmit={onSearch}>
                                <input name="searching" className="form-control me-2" type="search" placeholder="Search here......"></input>
                                <button className="btn btn-outline-primary" type="submit">Search</button>
                            </form>
                            <Link to="/login" className="btn btn-primary">Login</Link>
                        </div>
                    </div>
                </nav>
            </header>
        </>
    );
}