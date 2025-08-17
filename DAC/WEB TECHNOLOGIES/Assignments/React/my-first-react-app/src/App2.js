// 1.Create a react project and create three components A, B,C and try below component tree structure:
// b) Use B and C in A, Use A in App
import A from './components/A';
export default function App2(){
    return(
        <>
            <h1>B and C into A into App2</h1>
            <A />
        </>
    );
}