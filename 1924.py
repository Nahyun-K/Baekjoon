# 백준 1824번 2007년
x, y = map(int, input().split())
# x월 y일
array = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
graph = ['SUN','MON','TUE','WED','THU','FRI','SAT']
result = 0
for i in range(1, x):
    result += array[i]

result += y
result %= 7
print(graph[result])
