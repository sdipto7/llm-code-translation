
import sys

def main():
    result = []
    insert = sys.stdin
    n = -1

    while True:
        line = insert.readline().strip()
        n = int(line)
        if n == 0:
            break

        sum = 0
        input = [0] * n
        line = insert.readline().strip()
        array2 = line.split()

        for i in range(n):
            input[i] = int(array2[i])
            sum += input[i]

        avg = float(sum) / float(n)
        num = 0

        for i in range(n):
            if input[i] <= avg:
                num += 1

        result.append(num)

    for res in result:
        if res == -1:
            print("NONE")
        else:
            print(res)

if __name__ == "__main__":
    main()

