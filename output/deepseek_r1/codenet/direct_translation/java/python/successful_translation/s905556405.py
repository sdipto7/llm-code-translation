
import sys

data = list(map(int, sys.stdin.read().split()))
numlist = data[:5]
k = data[5]
print(':(' if numlist[4] - numlist[0] > k else 'Yay!')

