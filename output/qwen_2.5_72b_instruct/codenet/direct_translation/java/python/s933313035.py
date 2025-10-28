
class Node:
    def __init__(self, value=None):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, new_value):
        if new_value < self.value:
            if self.left is None:
                self.left = Node(new_value)
            else:
                self.left.insert(new_value)
        else:
            if self.right is None:
                self.right = Node(new_value)
            else:
                self.right.insert(new_value)

    def print_in_order(self):
        if self.left is not None:
            self.left.print_in_order()
        print(self.value, end=' ')
        if self.right is not None:
            self.right.print_in_order()

    def print_pre_order(self):
        print(self.value, end=' ')
        if self.left is not None:
            self.left.print_pre_order()
        if self.right is not None:
            self.right.print_pre_order()

import sys
sc = sys.stdin

m = int(sc.readline().strip())

tree = None
for _ in range(m):
    command = sc.readline().strip().split()[0]

    if command == "insert":
        key = int(sc.readline().strip().split()[0])
        if tree is None:
            tree = Node(key)
        else:
            tree.insert(key)
    else:
        if tree is not None:
            tree.print_in_order()
            print()
            tree.print_pre_order()
            print()

