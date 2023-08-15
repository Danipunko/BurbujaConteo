public class burbuja {
  public static void realizarBurbuja (int vec[], int pasos[]){
    int auxiliar;
    for (int i = 0; i < vec.length - 1; i++) {
      pasos[0]++;
        for (int j = 0; j < vec.length - i - 1; j++) {
            pasos[0]++;
            if (vec[j] > vec[j + 1]) {
                pasos[0]++;
                auxiliar = vec[j + 1];
                vec[j + 1] = vec[j];
                vec[j] = auxiliar;
                pasos[0]++;
            }
            pasos[1]++;
        }
    }
  }
}