import './App.css';
import React from 'react';
// import Product from './components/Product';

// Demonstrates use of props
// const App = () => {
//   return (
//     <div className="App">
//       <div>
//         <Product ItemNo="111" ItemName="Orange" ItemPrice="1.29"></Product>
//       </div>
//       <div>
//         <Product ItemNo="112" ItemName="Apple" ItemPrice="2.29"></Product>
//       </div>
//       <div>
//         <Product ItemNo="113" ItemName="Watermelon" ItemPrice="3.29"></Product>
//       </div>
//     </div>
//   );
// }


// Demonstration of use of states
// class App extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = { count: 0 };
//   }
//   incrementAmount = () => {
//     this.setState({ count: this.state.count + 1 });
//   }
//   render() {
//     return (
//       <div>
//         <p>{this.state.count}</p>
//         <button onClick={this.incrementAmount}>Increment</button>
//       </div>
//     );
//   }
// }

// Exercise 3
// class App extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = { count: 120 };


//   }

//   render() {
//     return (
//       <div>
//         <p>{this.state.count}</p>
//         <input
//           id={'my-input'}
//           type={'text'}
//           value={this.state.count}
//           placeholder={'Type here'}
//           onChange={event => {
//             this.setState({ count: event.target.value })
//           }}
//         />
//       </div>
//     );
//   }
// }

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = { price: 100 };


  }

  render() {
    return (
      <div>
        <p>Cost of Clothes: ${this.state.price}</p>

        <button onClick={event => {
          this.setState({ price: this.state.price * 0.75 })
        }}>Apply Discount</button>
      </div >
    );
  }
}


export default App;
