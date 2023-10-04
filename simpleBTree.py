# B+ tree in Python
import math

# Node creation
class Node:
    def __init__(self, order):
        self.order = order
        self.values = []
        self.keys = []
        self.nextKey = None
        self.parent = None
        self.check_leaf = False

# Insert at the leaf
def insert_at_leaf(self, value, key):
    i = 0
    while i < len(self.keys):
        if key < self.keys[i]:
            break
        i += 1
    if i + 1 == len(self.keys):
        self.values.append(value)
        self.keys.append(key)
    else:
        self.values = self.values[:i] + [value] + self.values[i:]
        self.keys = self.keys[:i] + [key] + self.keys[i:]

# B+ tree class
class BplusTree:
    def __init__(self, order):
        self.root = Node(order)
        self.root.check_leaf = True

    # Insert operation
    def insert(self, value, key):
        value = str(value)
        old_node = self.search(value)
        old_node.insert_at_leaf(old_node, value, key)

    # Search operation
    def find(self, value, key):
        node = self.search(value)
        if key in node.keys:
            return True
        return False

# Example usage
bplustree = BplusTree(3)
bplustree.insert('5', '33')
bplustree.insert('15', '21')
bplustree.insert('25', '31')
bplustree.insert('35', '41')
bplustree.insert('45', '10')
printTree(bplustree)
if bplustree.find('5', '34'):
    print("Found")
else:
    print("Not found")
