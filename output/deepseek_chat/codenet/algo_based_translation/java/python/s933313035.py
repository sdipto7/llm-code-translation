
import sys

class Node:
    def __init__(self):
        self.value = 0
        self.left = None
        self.right = None
    
    def insert(self, new_value):
        if new_value < self.value:
            if self.left is None:
                self.left = Node()
                self.left.value = new_value
            else:
                self.left.insert(new_value)
        else:
            if self.right is None:
                self.right = Node()
                self.right.value = new_value
            else:
                self.right.insert(new_value)
    
    def print_in_order(self):
        if self.left is not None:
            self.left.print_in_order()
        print(f" {self.value}", end="")
        if self.right is not None:
            self.right.print_in_order()
    
    def print_pre_order(self):
        print(f" {self.value}", end="")
        if self.left is not None:
            self.left.print_pre_order()
        if self.right is not None:
            self.right.print_pre_order()

def main():
    data = sys.stdin.read().split()
    index = 0
    
    m = int(data[index])
    index += 1
    
    tree = None
    
    for i in range(m):
        command = data[index]
        index += 1
        
        if command == "insert":
            key = int(data[index])
            index += 1
            
            if tree is None:
                tree = Node()
                tree.value = key
            else:
                tree.insert(key)
        else:
            if tree is not None:
                tree.print_in_order()
                print()
                tree.print_pre_order()
                print()

if __name__ == "__main__":
    main()

