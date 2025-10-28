
import sys

def main():
    N = int(sys.stdin.readline().strip())
    numbers = []
    
    for i in range(N):
        numbers.append(int(sys.stdin.readline().strip()))
    
    count = 0
    
    while True:
        numbers = [x // 2 for x in numbers if x % 2 == 0]
        if len(numbers) != N:
            break
        count += 1
    
    print(count)

if __name__ == "__main__":
    main()

