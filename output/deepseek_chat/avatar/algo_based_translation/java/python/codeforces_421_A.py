
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    a = int(data[1])
    b = int(data[2])
    index = 3
    list1 = []
    list2 = []
    for i in range(a):
        list1.append(int(data[index]))
        index += 1
    for i in range(b):
        list2.append(int(data[index]))
        index += 1
    output_lines = []
    for i in range(n):
        if (i + 1) in list1:
            output_lines.append("1")
        else:
            output_lines.append("2")
    print(" ".join(output_lines))

if __name__ == "__main__":
    main()

