export default function MovieTable({movies}){
    return (
        <>
            <div className="container">
                <h4 className="text-center">MovieList</h4>
                <hr />
                    <table className="table table-bordered table stripped">
                        <thead>
                            <tr>
                                <th>Movie Name</th>
                                <th>Actor</th>
                                <th>Release Date</th>
                                <th>Movie Theatre Type</th>
                                <th>Movie Language</th>
                            </tr>
                        </thead>
                        <tbody>
                            {movies.map((value, index) => (
                                <tr key={index}>
                                    <td>{value.mname}</td>
                                    <td>{value.mactor}</td>
                                    <td>{value.rdate}</td>
                                    <td>{value.mtype.join(',')}</td>
                                    <td>{value.mstate}</td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
            </div>   
        </>
    );
}