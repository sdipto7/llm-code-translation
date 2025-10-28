
def solve(test_number, in_stream, out_stream):
    s = in_stream.replace("BC", "D")
    cnt = 0
    tmp = 0

    for char in s:
        if char == 'A':
            tmp += 1
        elif char == 'D':
            cnt += tmp
        else:
            tmp = 0

    out_stream.write(f"{cnt}\n")

if __name__ == "__main__":
    import sys
    input_stream = sys.stdin.read().strip()
    output_stream = sys.stdout
    solve(1, input_stream, output_stream)

