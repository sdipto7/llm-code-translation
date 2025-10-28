
import sys

def func(a):
    min_val = 0
    i = 0
    while i < len(a):
        if a[i] == 0:
            del a[i]
        else:
            if min_val != 0:
                a[i] %= min_val
                if a[i] == 1:
                    print(1)
                    sys.exit()
            else:
                min_val = a[i]
            i += 1
    a.sort()
    return a

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    n = data[ptr]
    ptr += 1
    if n == 1:
        print(data[ptr])
        return
    a = data[ptr:ptr+n]
    a.sort()
    if a[-1] == 0:
        print(0)
        return
    while True:
        if len(a) == 1:
            print(a[0])
            break
        a = func(a)

if __name__ == "__main__":
    main()

