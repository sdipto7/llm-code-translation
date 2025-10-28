
import sys

def main():
    result = []
    n = -1
    while True:
        line = sys.stdin.readline().strip()
        n = int(line)
        if n == 0:
            break
        for i in range(n):
            pass
        line = sys.stdin.readline().strip()
        array2 = line.split()
        input_arr = [0] * n
        total = 0
        for i in range(n):
            input_arr[i] = int(array2[i])
            total += input_arr[i]
        avg = total / n
        num = 0
        for i in range(n):
            if input_arr[i] <= avg:
                num += 1
        result.append(num)
    
    for i in range(len(result)):
        if result[i] == -1:
            print("NONE")
        else:
            print(result[i])

if __name__ == "__main__":
    main()

