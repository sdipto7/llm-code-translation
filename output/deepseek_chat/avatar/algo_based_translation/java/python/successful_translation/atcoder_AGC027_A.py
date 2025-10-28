
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    N = int(data[0])
    x = int(data[1])
    sweet = []
    index = 2
    for i in range(N):
        a = int(data[index])
        index += 1
        sweet.append(a)
    
    sweet.sort()
    num = 0
    for i in range(N):
        if x - sweet[num] >= 0:
            x -= sweet[num]
            num += 1
        else:
            break
    
    if num == N and x > 0:
        num -= 1
    
    print(num)

if __name__ == "__main__":
    main()

