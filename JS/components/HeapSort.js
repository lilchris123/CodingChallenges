import React from 'react';
import heapSort from '../sortingAlgoritms/heapSort';

const HeapSort = (props) => {
  return (
    <div>
      <h2>Heap Sort</h2>
      <div style={{ marginLeft: "1rem" }}>
        <h4>Unsorted array</h4>
        <div>{props.arr.toString()}</div>
        <h4>Sorted array</h4>
        <div>{heapSort(props.arr).toString()}</div>
      </div>
    </div>
  );
};

export default HeapSort;
