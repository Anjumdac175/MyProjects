import { useContext } from 'react';
import MovieContext from './MovieContext';

export default function MoviesTable(){
    const {movieList} = useContext(MovieContext);
    if(movieList.length === 0) return null;
    return (
        <>
            <div className='col-7 shadow bg-primary-subtle p-3 rounded-3'>
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
                            {movieList.map((value, index) => (
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