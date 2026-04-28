package org.jsp.merchantproductapp.dao;

import java.util.List;

import javax.persistence.*;
import org.jsp.merchantapp.*;

public class ProductDao {
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();

	public Product addProduct(int mid, Product p) {
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		Merchant mdb = man.find(Merchant.class, mid);
		if(mdb != null)
		{
			p.setMerchant(mdb);
			mdb.getProducts().add(p);
			man.persist(p);
			tran.commit();
			return p;
		}
		else {
			return null;
		}
	}

	public List<Product> findProductByMerchantId(int mid) {
		Query q = man.createQuery("select m.products from Merchant m where m.id=?1");
		q.setParameter(1, mid);
		List<Product> lp= q.getResultList();
		return lp;
	}

	public Product updateProduct(Product p) {
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		Product pdb = man.find(Product.class, p.getId());
		if(pdb != null)
		{
			pdb.setName(p.getName());
			pdb.setBrand(p.getBrand());
			pdb.setCategory(p.getCategory());
			pdb.setCost(p.getCost());
			tran.commit();
			return p;
		}
		else {
			return null;
		}
	}

	public List<Product> findProductByBrand(String brand) {
		Query q = man.createQuery("select p from Product p where p.brand=?1");
		q.setParameter(1, brand);
		List<Product> lp = q.getResultList();
		return lp;
				
	}

	public List<Product> findProductByCategogy(String category) {
		Query q = man.createQuery("select p from Product p where p.category=?1");
		q.setParameter(1, category);
		List<Product> lp = q.getResultList();
		return lp;
	}
}
