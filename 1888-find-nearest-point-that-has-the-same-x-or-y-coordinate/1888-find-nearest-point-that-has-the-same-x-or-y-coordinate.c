int nearestValidPoint(int x, int y, int** points, int pointsSize, int* pointsColSize) {
  int nearest_index = -1;
    int min_distance = INT_MAX;

    for (int i = 0; i < pointsSize; i++) {
        int xi = points[i][0];
        int yi = points[i][1];

        if (xi == x || yi == y) {
            int distance = abs(xi - x) + abs(yi - y);

            if (distance < min_distance) {
                min_distance = distance;
                nearest_index = i;
            }
        }
    }

    return nearest_index;
}
  