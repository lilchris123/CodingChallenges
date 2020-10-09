import React from "react";
import BubbleSort from './components/BubbleSort';
import SelectionSort from './components/SelectionSort';
import InsertionSort from './components/InsertionSort';
import MergeSort from './components/MergeSort';
import QuickSort from './components/QuickSort';

const App = () => {
  return (
    <div>
      <SelectionSort arr={[10,3,8,5]}/>
      <BubbleSort arr={[7,3,20,1,5]} />
      <InsertionSort arr={[8,2,9,4,10]}/>
      <MergeSort arr={[8,2,9,4,10]}/>
      <QuickSort arr={[7,2,9,3,6,1]}/>
    </div>
  );
};

export default App;