// 1.Create a react project and create three components A, B,C and try below component tree structure:
// d) Use A in B and C, Use B and C in App
import B from './components/B';
import C from './components/C'
export default function App4(){
    return(
        <>
            <h1>Use A in B and C, Use B and C in App4</h1>
            <B />
            <C />
        </>
    );
}