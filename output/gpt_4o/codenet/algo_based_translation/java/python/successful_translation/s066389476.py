
def main():
    import sys
    solve(sys.stdin)

def solve(input_source):
    a = list(input_source.readline().strip())
    if a[0] == a[1] or a[1] == a[2] or a[2] == a[0]:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()

