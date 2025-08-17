// 1.Create a react project and create three components A, B,C and try below component tree structure:
// c) Use A and B and C in App

import A from './components/A';
import B from './components/B';
import C from './components/C'

function App3() {
  return (
    <div>
      <h1> Use A and B and C in App..</h1>
       <A />
       <B />
       <C />
    </div>
  );
}

export default App3;