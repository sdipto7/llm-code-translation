
import sys

def main():
    data = sys.stdin.read().split()
    ptr = 0
    a = int(data[ptr])
    ptr += 1
    b = int(data[ptr])
    ptr += 1

    ju = [False] * 100001
    pe = [0] * 100001

    for _ in range(b):
        n = int(data[ptr])
        ptr += 1
        res = data[ptr]
        ptr += 1
        if res == 'WA' and not ju[n-1]:
            pe[n-1] += 1
        if res == 'AC':
            ju[n-1] = True

    ac = 0
    wa = 0
    for i in range(a):
        if ju[i]:
            ac += 1
            wa += pe[i]

    print(f"{ac} {wa}")

if __name__ == "__main__":
    main()

