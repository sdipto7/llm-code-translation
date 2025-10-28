
import sys

def main():
    result = []
    n = -1
    for line in sys.stdin:
        line = line.strip()
        if not line:
            continue
        n = int(line)
        if n == 0:
            break
        line = sys.stdin.readline().strip()
        array2 = line.split(" ")
        input_array = [int(x) for x in array2]
        total_sum = sum(input_array)
        avg = total_sum / n
        num = sum(1 for x in input_array if x <= avg)
        result.append(num)

    for num in result:
        if num == -1:
            print("NONE")
        else:
            print(num)

if __name__ == "__main__":
    main()

