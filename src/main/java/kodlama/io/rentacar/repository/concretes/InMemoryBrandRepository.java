package kodlama.io.rentacar.repository.concretes;

import kodlama.io.rentacar.entities.concretes.Brand;
import kodlama.io.rentacar.repository.abstracts.BrandRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<>();
        brands.add(new Brand(1,"Mercedes"));
        brands.add(new Brand(2,"Honda"));
        brands.add(new Brand(3,"Tesla"));
        brands.add(new Brand(4,"Reno"));
        brands.add(new Brand(5,"Volvo"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }

    @Override
    public Brand getById(int id) {
        return brands.get(id-1);

    }

    @Override
    public Brand add(Brand brand) {
        brands.add(brand);
        return brand;
    }

    @Override
    public Brand update(int id, Brand brand) {
        return brands.set(id-1,brand);
    }

    @Override
    public void delete(int id) {
        brands.remove(id-1);
    }
}
