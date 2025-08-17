import { useContext } from 'react';
import PizzaContext from "./PizzaContext";

export default function OrderList(){
    const {order, deleteOrder, editOrder} = useContext(PizzaContext);

  
    if(order.length === 0) return null;
    return (
        <>
            <div className="col-8 shadow bg-primary-subtle rounded-4">
                <h1 className="text-center"> OrderList</h1>
                <hr />
                  <table className="table table-bordered table-stripped">
                    <thead>
                        <tr>
                            <th>Customer Name</th>
                            <th>Pizza Type</th>
                            <th>Toppings</th>
                            <th>Delivery Instructions</th>
                            <th>Action</th>
                            <th>Edit</th>
                        </tr>
                    </thead>
                    <tbody> {
                        order.map((list, index) => (
                            <tr key={index}>
                            <td>{list.cname}</td>
                            <td>{list.ptype}</td>
                            <td>{list.top.join(",")}</td>
                            <td>{list.instr}</td>
                            <td>
                            <button className='btn btn-sm btn-warning me-2' onClick={() => editOrder(list, index)}>
                                <i className="bi bi-pencil-square"></i>
                                </button>
                            </td>

                            <td>
                              <button className='btn btn-sm btn-danger' onClick={() => deleteOrder(index)}>
                                <i class="bi bi-trash"></i>
                                </button>
                            </td>
                        </tr>
                        )
                        )}
                    </tbody>
                  </table>
            </div>
        </>
    );
};