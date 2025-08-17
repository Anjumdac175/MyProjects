// 1.Create a react project and create three components A, B,C and try below component tree structure:
// a) A <- B <-C

import A from './components/A';
export default function App1(){
    return(
        <>
            <h1>C into B into A into App1</h1>
            <A />
        </>
    );
}