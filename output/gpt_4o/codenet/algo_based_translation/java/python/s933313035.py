
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

    def print_in_order(self):
        if self.left is not None:
            self.left.print_in_order()
        print(f" {self.value}", end='')
        if self.right is not None:
            self.right.print_in_order()

    def print_pre_order(self):
        print(f" {self.value}", end='')
        if self.left is not None:
            self.left.print_pre_order()
        if self.right is not None:
            self.right.print_pre_order()


def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    m = int(data[0])
    tree = None
    index = 1

    for _ in range(m):
        command = data[index]
        index += 1

        if command == "insert":
            key = int(data[index])
            index += 1
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

if __name__ == "__main__":
    main()

