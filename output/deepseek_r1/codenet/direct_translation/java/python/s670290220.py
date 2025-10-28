
import sys

data = sys.stdin.read().split()
n = int(data[0])
s = data[1]
print(''.join([chr((ord(c) - ord('A') + n) % 26 + ord('A')) for c in s]))

