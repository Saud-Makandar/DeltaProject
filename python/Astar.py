graph = {
    'A': {'S': 4, 'G': 3},
    'S': {'A': 4, 'B': 2},
    'B': {'S': 2, 'G': 1},
    'G': {'A': 3, 'B': 1}
}

h = {
    'S': 4,
    'A': 2,
    'B': 1,
    'G': 0
}

def astar(start, goal):
    open_list = [start]
    cost = {start: 0}
    parent = {start: None}

    while open_list:
        # Find node with smallest f = g + h
        current = min(open_list,
                      key=lambda node: cost[node] + h[node])

        open_list.remove(current)

        if current == goal:
            break

        for neighbour in graph[current]:
            new_cost = cost[current] + graph[current][neighbour]

            if neighbour not in cost or new_cost < cost[neighbour]:
                cost[neighbour] = new_cost
                parent[neighbour] = current

                if neighbour not in open_list:
                    open_list.append(neighbour)

    # Create path
    path = []
    node = goal

    while node is not None:
        path.append(node)
        node = parent[node]

    path.reverse()

    return path, cost[goal]


path, cost = astar('A', 'G')

print("Shortest Path:", path)
print("Total Cost:", cost)