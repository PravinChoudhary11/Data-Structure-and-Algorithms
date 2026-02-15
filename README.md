# DSA Preparation Repository

## Purpose

This repository is my structured system for mastering Data Structures, Algorithms, and interview problem-solving patterns for technical placements.
It is organized to reflect **how problems are actually solved in interviews** — not just by topic, but by **patterns, techniques, and mental models**.

The goal is not only to store code, but to build:

* Concept clarity
* Pattern recognition ability
* Revision efficiency
* Interview explanation skills

---

## Repository Philosophy

Most DSA repositories are topic-based only (Arrays, Trees, Graphs).
This repo follows a **3-layer learning model**:

### 1️⃣ Data Structures Layer

Contains implementations and utilities for core structures.

Focus:

* Understanding internal mechanics
* Traversal methods
* Helper builders/printers
* Base operations

Examples:

* Trees, Graphs, Trie, Heap, Linked List, Stack, Queue, Hashing

This layer answers:

> “How does the structure work?”

---

### 2️⃣ Algorithms Layer

Contains algorithms that operate on data structures.

Focus:

* Standard algorithm implementations
* Graph algorithms, sorting, searching, string algorithms
* Structural transformations

Examples:

* Dijkstra, Kruskal, Topological Sort
* Merge Sort, Quick Sort
* KMP, Rabin-Karp, Z-Algorithm

This layer answers:

> “What procedure solves this class of problems?”

---

### 3️⃣ Patterns Layer (Core of Interview Prep)

Contains reusable problem-solving frameworks.

Focus:

* Recognizing problem patterns quickly
* Grouping similar interview problems
* Learning how to approach unseen problems

Examples:

* Sliding Window
* Binary Search on Answer
* Dynamic Programming patterns
* Backtracking patterns
* Greedy strategies

This layer answers:

> “How should I think about this problem?”

---

## Folder Classification Logic

### DataStructures/

Contains:

* Implementations
* Helpers (builders/printers)
* Traversals
* Structure-specific operations

These are **building blocks**, not interview strategies.

---

### Algorithms/DataStructureAlgorithms/

Contains algorithms that operate on structures.

Examples:

* Graph algorithms (Shortest Path, MST, SCC)
* String matching algorithms
* Tree algorithms

These are **classical procedures** that must be memorized and understood.

---

### CorePatterns / AdvancedPatterns

Contains **problem-solving techniques**, not raw algorithms.

Patterns here are:

* Reusable across many problems
* Recognizable by constraints or input form
* Central to interview success

Examples:

* Dynamic Programming sub-patterns
* Backtracking classifications
* Greedy strategies
* Mathematical techniques

---

### DS-Bound Patterns

Some patterns depend heavily on a specific data structure and are kept near it.

Examples:

* Monotonic Stack → tied to Stack behavior
* Monotonic Queue → tied to Deque mechanics

These are stored with structure-related sections to preserve conceptual clarity.

---

## How I Solve Problems (Workflow)

1. Identify the data structure involved
2. Check if it matches a known pattern
3. Map it to a folder in this repo
4. Implement clean solution
5. Add comments explaining:

    * Pattern used
    * Why it works
    * Time/space complexity
6. If tricky, add it to revision list

---

## Revision Strategy

Problems are revised in three cycles:

**Cycle 1 — Understanding**

* Solve with help if needed
* Focus on pattern recognition

**Cycle 2 — Recall**

* Re-solve without looking
* Explain aloud

**Cycle 3 — Speed**

* Solve quickly
* Practice writing clean code in one go

Hard problems and mistakes are tracked for focused revision.

---

## Long-Term Goal

By maintaining this structure, I aim to:

* Recognize problem patterns instantly
* Reduce solving time in coding rounds
* Explain solutions clearly in interviews
* Build a reusable personal DSA knowledge base

This repository represents my **thinking system**, not just my code.
