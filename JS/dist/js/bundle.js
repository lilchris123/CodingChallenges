/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = "./index.js");
/******/ })
/************************************************************************/
/******/ ({

/***/ "./dataStructures/linkedlist/LinkedList.js":
/*!*************************************************!*\
  !*** ./dataStructures/linkedlist/LinkedList.js ***!
  \*************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, \"default\", function() { return LinkedList; });\n/* harmony import */ var _LinkedListNode__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./LinkedListNode */ \"./dataStructures/linkedlist/LinkedListNode.js\");\nfunction _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError(\"Cannot call a class as a function\"); } }\n\nfunction _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if (\"value\" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }\n\nfunction _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }\n\n\n\nvar LinkedList = /*#__PURE__*/function () {\n  function LinkedList() {\n    _classCallCheck(this, LinkedList);\n\n    /** @var LinkedListNode */\n    this.head = null;\n    /** @var LinkedListNode */\n\n    this.tail = null;\n  }\n  /**\n   * @param {*} value\n   * @return {LinkedList}\n   */\n\n\n  _createClass(LinkedList, [{\n    key: \"prepend\",\n    value: function prepend(value) {\n      var node = new _LinkedListNode__WEBPACK_IMPORTED_MODULE_0__[\"default\"](value, this.head);\n\n      if (this.head == null) {\n        this.head = node;\n        this.tail = node;\n      } else {\n        this.head = node;\n      }\n\n      return this;\n    }\n    /**\n     * @param {*} value\n     * @return {LinkedList}\n     */\n\n  }, {\n    key: \"append\",\n    value: function append(value) {\n      var newNode = new _LinkedListNode__WEBPACK_IMPORTED_MODULE_0__[\"default\"](value);\n\n      if (this.head == null) {\n        this.head = newNode;\n        this.tail = newNode;\n      } else this.tail.next = newNode;\n\n      this.tail = newNode;\n      return this;\n    }\n    /**\n     * @param {*} value\n     * @return {LinkedListNode}\n     */\n\n  }, {\n    key: \"delete\",\n    value: function _delete(value) {\n      if (!this.head) return null;\n      var deletedNode = null;\n\n      while (this.head && this.head.value === value) {\n        deletedNode = this.head;\n        this.head = this.head.next;\n      }\n\n      var currNode = this.head;\n\n      if (currNode !== null) {\n        while (currNode.next) {\n          if (currNode.next.value === value) {\n            deletedNode = currNode.next;\n            currNode.next = currNode.next.next;\n          } else currNode = currNode.next;\n        }\n      }\n\n      if (this.tail.value === value) this.tail = currNode;\n      return deletedNode;\n    }\n    /**\n     * @param {*} value \n     * @return {LinkedListNode}\n     */\n\n  }, {\n    key: \"find\",\n    value: function find(value) {\n      var currNode = this.head;\n\n      while (currNode) {\n        if (currNode.value === value) return currNode;\n        currNode = currNode.next;\n      }\n\n      return null;\n    }\n    /**\n     * @return {LinkedListNode[]}\n     */\n\n  }, {\n    key: \"toArray\",\n    value: function toArray() {\n      var nodes = [];\n      var currNode = this.head;\n\n      while (currNode) {\n        nodes.push(currNode.value);\n        currNode = currNode.next;\n      }\n\n      return nodes;\n    }\n    /**\n     * @param {function} [callback]\n     * @return {string}\n     */\n\n  }, {\n    key: \"toString\",\n    value: function toString(callback) {\n      return this.toArray().map(function (node) {\n        return node.toString(callback);\n      }).toString();\n    } // 2 -> 5 -> 7 -> null      prev= null curr= 2 next = 5\n    // null <- 2  5-> 7 -> null prev= 2 curr =5 next = 7\n    // null <- 2 <- 5 7-> null  prev= 5 curr =7 next = null\n    // null <- 2 <- 5 <- 7      prev= 5 curr =7 next = null\n\n  }, {\n    key: \"reverse\",\n    value: function reverse() {\n      if (this.head == null) return this;\n      this.tail = this.head;\n      var prevNode = null;\n      var currNode = this.head;\n      var nextNode = this.head.next;\n\n      while (nextNode) {\n        currNode.next = prevNode;\n        prevNode = currNode;\n        currNode = nextNode;\n        nextNode = nextNode.next;\n      }\n\n      currNode.next = prevNode;\n      this.head = currNode;\n      return this;\n    }\n  }]);\n\n  return LinkedList;\n}();\n\n\n\n//# sourceURL=webpack:///./dataStructures/linkedlist/LinkedList.js?");

/***/ }),

/***/ "./dataStructures/linkedlist/LinkedListNode.js":
/*!*****************************************************!*\
  !*** ./dataStructures/linkedlist/LinkedListNode.js ***!
  \*****************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, \"default\", function() { return LinkedListNode; });\nfunction _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError(\"Cannot call a class as a function\"); } }\n\nfunction _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if (\"value\" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }\n\nfunction _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }\n\nvar LinkedListNode = /*#__PURE__*/function () {\n  function LinkedListNode(value) {\n    var next = arguments.length > 1 && arguments[1] !== undefined ? arguments[1] : null;\n\n    _classCallCheck(this, LinkedListNode);\n\n    this.value = value;\n    this.next = next;\n  }\n\n  _createClass(LinkedListNode, [{\n    key: \"toString\",\n    value: function toString(callback) {\n      return callback ? callback(this.value) : \"\".concat(this.value);\n    }\n  }]);\n\n  return LinkedListNode;\n}();\n\n\n\n//# sourceURL=webpack:///./dataStructures/linkedlist/LinkedListNode.js?");

/***/ }),

/***/ "./index.js":
/*!******************!*\
  !*** ./index.js ***!
  \******************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony import */ var _dataStructures_linkedlist_LinkedList__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./dataStructures/linkedlist/LinkedList */ \"./dataStructures/linkedlist/LinkedList.js\");\n\n\nfunction linkedListEx() {\n  var l1 = new _dataStructures_linkedlist_LinkedList__WEBPACK_IMPORTED_MODULE_0__[\"default\"]();\n  l1.append(10);\n  l1.append(5);\n  l1.append(7);\n  l1.append(1);\n  console.log(l1.toString());\n  console.log(l1.reverse().toString());\n}\n\nlinkedListEx();\n\n//# sourceURL=webpack:///./index.js?");

/***/ })

/******/ });