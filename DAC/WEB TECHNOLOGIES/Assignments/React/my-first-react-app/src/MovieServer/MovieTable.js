import { useContext } from 'react';
import MovieContext from './MovieContext';

export default function MoviesTable(){
    const {movieList, setMovieList} = useContext(MovieContext);

    const handleDelete = async(index) => {
        try{
            const res = await fetch(`/api/movies/${index}`,{
                method: 'DELETE',
            });

            if(res.ok){
                const updateList = await fetch('/api/movies').then(r => r.json());
                setMovieList(updateList);

            }else{
                console.log("Failed to delete");
            }

        }catch(err){
            console.log("Error while deleting..");
        }

    };

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
                                <th>Action</th>
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
                                    <td>
                                        <button className='btn btn-sm btn-danger' onClick={() => handleDelete(index)}><i class="bi bi-trash"></i></button>
                                    </td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                    </div>
        </>
    );
}