
class AStationAndBus:
    def solve(self, test_number, in_stream, out_stream):
        s = in_stream.strip()
        if 'A' in s and 'B' in s:
            out_stream.write("Yes\n")
        else:
            out_stream.write("No\n")

if __name__ == "__main__":
    import sys
    input_stream = sys.stdin.read
    output_stream = sys.stdout
    solver = AStationAndBus()
    solver.solve(1, input_stream(), output_stream)

