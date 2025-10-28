
class Node:
    def __init__(self, value):
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
        result = []
        if self.left:
            result += self.left.print_in_order()
        result.append(self.value)
        if self.right:
            result += self.right.print_in_order()
        return result

    def print_pre_order(self):
        result = [self.value]
        if self.left:
            result += self.left.print_pre_order()
        if self.right:
            result += self.right.print_pre_order()
        return result

tree = None
m = int(input())
for _ in range(m):
    parts = input().split()
    if parts[0] == 'insert':
        key = int(parts[1])
        if tree is None:
            tree = Node(key)
        else:
            tree.insert(key)
    else:
        if tree is not None:
            in_order = tree.print_in_order()
            print(' ' + ' '.join(map(str, in_order)), end='')
            print()
            pre_order = tree.print_pre_order()
            print(' ' + ' '.join(map(str, pre_order)), end='')
            print()

