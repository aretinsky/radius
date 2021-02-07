CREATE IF NOT EXISTS TABLE `task`
(
    `id`      INT AUTO_INCREMENT,
    `subject` VARCHAR(40) DEFAULT 'Другое',
    `author`  VARCHAR(20) DEFAULT 'анонимус',
    `date`    DATETIME,
    `grade`   INT(1),
    `title`   VARCHAR(150) NOT NULL,
    PRIMARY KEY (`id`)
);


-- dumping data --
INSERT INTO `task` (`id`, `subject`, `author`, `date`, `grade`, `title`)
VALUES (NULL, 'Алгебра', 'анонимус', NULL, '9', 'Дз по алгебре, номера 350 и 352'),
       (NULL, 'Английский', 'Виктор Аретинский', NULL, '9', 'Дз по английскому(группа марата)')
