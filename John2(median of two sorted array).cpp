double median(vector<int>& a, vector<int>& b) {
    double n = a.size();
    double m = b.size();
    vector<int> c(n + m);
    merge(a.begin(), a.end(), b.begin(), b.end(), c.begin());
    if (fmod(n + m, 2.0) == 0.0) {
        return (c[(n + m) / 2 - 1] + c[(n + m) / 2]) / 2.0;

    } else {
        return c[(n + m) / 2];

    }

}

 
