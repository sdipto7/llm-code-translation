import sys

class Node:
    def __init__(self, value=None):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, newValue):
        if newValue < self.value:
            if self.left is None:
                self.left = Node(newValue)
            else:
                self.left.insert(newValue)
        else:
            if self.right is None:
                self.right = Node(newValue)
            else:
                self.right.insert(newValue)

    def printInOrder(self):
        if self.left is not None:
            self.left.printInOrder()
        print(f" {self.value}", end="")
        if self.right is not None:
            self.right.printInOrder()

    def printPreOrder(self):
        print(f" {self.value}", end="")
        if self.left is not None:
            self.left.printPreOrder()
        if self.right is not None:
            self.right.printPreOrder()

def main():
    import sys
    input = sys.stdin.read().split()
    index = 0
    m = int(input[index])
    index += 1
    tree = None
    for i in range(m):
        command = input[index]
        index += 1
        if command == "insert":
            key = int(input[index])
            index += 1
            if tree is None:
                tree = Node(key)
            else:
                tree.insert(key)
        else:
            if tree is not None:
                tree.printInOrder()
                print()
                tree.printPreOrder()
                print()

if __name__ == "__main__":
    main()
