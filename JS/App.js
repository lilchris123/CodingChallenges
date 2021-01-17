import React from "react";
import BubbleSort from './components/BubbleSort';
import SelectionSort from './components/SelectionSort';
import InsertionSort from './components/InsertionSort';
import MergeSort from './components/MergeSort';
import QuickSort from './components/QuickSort';
import RandomUsers from './containers/RandomUsers';
import InputExample from "./containers/InputExample";
import InputRefExample from "./containers/InputRefExample";
import FunctionalInputExample from "./containers/functionalInputExample";
import "./App.css";

const App = () => {
  return (
    <div>
      <h2>React Container</h2>
      <InputExample/>
    </div>
  );
};

export default App;