
def main():
    x = input().strip()
    stack = []
    c = 0
    for char in x:
        stack.append(char)
        while len(stack) >= 2:
            p = stack.pop()
            q = stack.pop()
            if p != q:
                c += 1
            else:
                stack.append(q)
                stack.append(p)
                break
    print(c * 2)

if __name__ == "__main__":
    main()

