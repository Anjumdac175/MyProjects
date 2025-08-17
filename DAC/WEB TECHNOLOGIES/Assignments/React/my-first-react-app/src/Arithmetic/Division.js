export default function Division({num1, num2}) {
    return (
        <>
            <p><strong>Division :  </strong> {num2 !== 0 ? (num1 / num2 ).toFixed(2) : 'Cannot divide by Zero'}</p> 
        </>
    );   
}
//toFixed is used to round the decimal value to 2