
import sys

def main():
    import sys
    input = sys.stdin.read().split()
    h = int(input[0])
    w = int(input[1])
    ans = []
    index = 2
    for i in range(h):
        line = input[index]
        ans.append("#" + line + "#")
        index += 1
    top_bottom_border = "#" * (w + 2)
    print(top_bottom_border)
    for s in ans:
        print(s)
    print(top_bottom_border)

if __name__ == "__main__":
    main()

