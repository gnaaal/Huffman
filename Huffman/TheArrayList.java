// Source code is decompiled from a .class file using FernFlower decompiler.
package strukdat;

public class TheArrayList<E> {
   Object[] thelist;
   private int n;
   private int max_size;

   public TheArrayList(int var1) {
      this.thelist = new Object[var1];
      this.n = 0;
      this.max_size = var1;
   }

   public int maxSize() {
      return this.max_size;
   }

   public int size() {
      return this.n;
   }

   private boolean isFull() {
      return this.n == this.max_size;
   }

   public boolean isEmpty() {
      return this.n == 0;
   }

   public void add(E var1) {
      if (!this.isFull()) {
         this.thelist[this.n] = var1;
         ++this.n;
      } else {
         System.out.println("List sudah penuh!");
      }

   }

   public void add(int var1, E var2) {
      if (var1 >= 0 && !this.isFull()) {
         ++this.n;
         int var3 = this.n;

         do {
            this.thelist[var3] = this.thelist[var3 - 1];
            --var3;
         } while(var3 > var1);

         this.thelist[var1] = var2;
      } else {
         System.out.println("List sudah penuh!");
      }

   }

   public void remove(int var1) {
      if (var1 >= 0 && !this.isEmpty()) {
         for(int var2 = var1; var2 < this.n - 1; ++var2) {
            this.thelist[var2] = this.thelist[var2 + 1];
         }

         this.thelist[this.n - 1] = null;
         --this.n;
      }

   }

   public E get(int var1) {
      Object var2 = this.thelist[var1];
      return var2;
   }

   public void set(int var1, E var2) {
      this.thelist[var1] = var2;
   }

   public void clear() {
      if (!this.isEmpty()) {
         for(int var1 = 0; var1 < this.n; ++var1) {
            this.thelist[var1] = null;
         }

         this.n = 0;
      }

   }

   public void cetakList() {
      if (this.isEmpty()) {
         System.out.println("List kosong!");
      } else {
         System.out.print("[ ");

         for(int var1 = 0; var1 < this.n; ++var1) {
            Object var10001 = this.thelist[var1];
            System.out.print(var10001.toString() + " ");
         }

         System.out.println("]");
      }

   }
}
