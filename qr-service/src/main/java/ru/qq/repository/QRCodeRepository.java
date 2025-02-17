package ru.qq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.qq.entity.QRCode;

@Repository
public interface QRCodeRepository extends JpaRepository<QRCode, Long> {
}
