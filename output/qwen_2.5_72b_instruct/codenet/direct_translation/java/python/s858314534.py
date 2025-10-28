import sys

def log(str):
    print(str)

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())
T = int(sys.stdin.readline())

log((T // A) * B)
