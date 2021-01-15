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
import BinarySearchTreeNode from './dataStructures/tree/BinarySearchTree/BinarySearchTreeNode';
import {secLargestNode} from './challenges/daily/SecLargestBSTNode36';
const App = () => {
  let root= new BinarySearchTreeNode(10);
  root.insert(5);
  //root.insert(19);
  root.insert(2);
  root.insert(7);

  
  return (
    <div>
      <h2>React Container</h2>
      <h3>{secLargestNode(root)}</h3>
    </div>
  );
};

export default App;