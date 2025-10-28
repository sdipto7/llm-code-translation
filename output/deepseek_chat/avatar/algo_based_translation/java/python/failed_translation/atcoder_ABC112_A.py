
import sys

def main():
    br = None
    n = int(input())
    if n == 1:
        print("Hello World")
    else:
        strs = read(2)
        print(int(strs[0]) + int(strs[1]))

def read(length):
    str_list = []
    global br
    if br is None:
        br = sys.stdin
    for i in range(length):
        str_list.append(br.readline().strip())
    return str_list

def close():
    global br
    if br is not None:
        br.close()

if __name__ == "__main__":
    main()
    close()

