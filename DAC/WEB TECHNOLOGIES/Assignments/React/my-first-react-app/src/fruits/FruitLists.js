export default function FruitLists({fruits}){
 return (
    <div className="col-3 p-4 shadow bg-primary-subtle rounded-4">
        <h3 className="fw-bold">FruitList</h3>
        <hr />
        <ol className="fs-5 fw-normal">
            {fruits.map((list) => (
                <li>{list}</li>
            ))}
        </ol>
    </div>
 );
}