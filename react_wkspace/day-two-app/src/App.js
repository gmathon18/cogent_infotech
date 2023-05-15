import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';
import { ReactDOM } from 'react';

// class App extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = { hello: "World!" };
//   }

//   componentWillMount() {
//     console.log("componentWillMount()");
//   }

//   componentDidMount() {
//     console.log("componentDidMount()");
//   }

//   changeState() {
//     this.setState({ hello: "cogent!" });
//   }

//   render() {
//     return (
//       <div>
//         <h1>Cogent.org, Hello {this.state.hello}</h1>
//         <h2>
//           <a onClick={this.changeState.bind(this)}>Press Here!</a>
//         </h2>
//       </div>
//     );
//   }

//   shouldComponentUpdate(nextProps, nextState) {
//     console.log("shouldComponentUpdate()");
//     return true;
//   }

//   componentWillUpdate() {
//     console.log("componentWillUpdate()");
//   }

//   componentDidUpdate() {
//     console.log("componentDidUpdate");
//   }
// }

function App() {
  const [name, setName] = useState("kishore");
  const changeName = () => {
    setName("Gyan");
  };

  return (
    <div>
      <p>My name is {name}</p>
      <button onClick={changeName}>Click Me </button>
    </div>
  );
}
export default App;
